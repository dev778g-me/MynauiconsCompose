package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Outline.Map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 8.593f)
                curveToRelative(0f, -1.527f, 0f, -2.29f, 0.393f, -2.735f)
                curveToRelative(0.139f, -0.159f, 0.308f, -0.285f, 0.497f, -0.372f)
                curveToRelative(1.416f, -0.653f, 3.272f, 1.066f, 4.77f, 1.013f)
                quadToRelative(0.297f, -0.011f, 0.587f, -0.082f)
                curveToRelative(2.184f, -0.535f, 3.552f, -3.08f, 5.798f, -3.39f)
                curveToRelative(1.287f, -0.18f, 2.7f, 0.598f, 3.904f, 1.014f)
                curveToRelative(0.99f, 0.342f, 1.485f, 0.513f, 1.768f, 0.92f)
                reflectiveCurveTo(21f, 5.91f, 21f, 6.99f)
                verticalLineToRelative(8.422f)
                curveToRelative(0f, 1.526f, 0f, 2.29f, -0.393f, 2.735f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.497f, 0.371f)
                curveToRelative(-1.416f, 0.653f, -3.272f, -1.065f, -4.77f, -1.012f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.587f, 0.081f)
                curveToRelative(-2.184f, 0.535f, -3.552f, 3.08f, -5.798f, 3.391f)
                curveToRelative(-1.281f, 0.178f, -4.847f, -0.75f, -5.672f, -1.935f)
                curveTo(3f, 18.636f, 3f, 18.096f, 3f, 17.014f)
                close()
                moveTo(9f, 6.541f)
                verticalLineToRelative(14.255f)
                moveToRelative(6f, -17.615f)
                verticalLineToRelative(14.255f)
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
