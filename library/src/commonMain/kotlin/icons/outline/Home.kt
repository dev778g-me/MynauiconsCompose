package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Outline.Home",
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 21f)
                verticalLineToRelative(-5.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineTo(21f)
            }
        }.build()

        return _Home!!
    }

@Suppress("ObjectPropertyName")
private var _Home: ImageVector? = null
