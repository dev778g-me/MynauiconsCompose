package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.HomeCheck: ImageVector
    get() {
        if (_HomeCheck != null) {
            return _HomeCheck!!
        }
        _HomeCheck = ImageVector.Builder(
            name = "Outline.HomeCheck",
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
                moveToRelative(9.68f, 13.323f)
                lineToRelative(1.379f, 1.575f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.466f, -0.022f)
                lineToRelative(2.8f, -3.876f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.133f, 21f)
                curveTo(4.955f, 21f, 4f, 20.02f, 4f, 18.81f)
                verticalLineToRelative(-8.802f)
                curveToRelative(0f, -0.665f, 0.295f, -1.295f, 0.8f, -1.71f)
                lineToRelative(5.867f, -4.818f)
                arcToRelative(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.666f, 0f)
                lineToRelative(5.866f, 4.818f)
                curveToRelative(0.506f, 0.415f, 0.801f, 1.045f, 0.801f, 1.71f)
                verticalLineToRelative(8.802f)
                curveToRelative(0f, 1.21f, -0.955f, 2.19f, -2.133f, 2.19f)
                close()
            }
        }.build()

        return _HomeCheck!!
    }

@Suppress("ObjectPropertyName")
private var _HomeCheck: ImageVector? = null
