package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Controller: ImageVector
    get() {
        if (_Controller != null) {
            return _Controller!!
        }
        _Controller = ImageVector.Builder(
            name = "Outline.Controller",
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
                moveTo(7.5f, 11.5f)
                verticalLineToRelative(3f)
                moveTo(6f, 13f)
                horizontalLineToRelative(3f)
                moveToRelative(3f, -4.653f)
                curveToRelative(2.005f, 0f, 3.7f, -1.888f, 5.786f, -1.212f)
                curveToRelative(2.264f, 0.733f, 3.82f, 3.413f, 3.708f, 9.492f)
                curveToRelative(-0.022f, 1.224f, -0.336f, 2.578f, -1.546f, 3.106f)
                curveToRelative(-2.797f, 1.221f, -4.397f, -2.328f, -7f, -2.328f)
                horizontalLineToRelative(-1.897f)
                curveToRelative(-2.605f, 0f, -4.213f, 3.545f, -6.998f, 2.328f)
                curveToRelative(-1.21f, -0.528f, -1.525f, -1.882f, -1.547f, -3.107f)
                curveToRelative(-0.113f, -6.078f, 1.444f, -8.758f, 3.708f, -9.491f)
                curveTo(8.299f, 6.459f, 9.994f, 8.347f, 12f, 8.347f)
                moveToRelative(0f, -4.565f)
                verticalLineToRelative(4.342f)
                moveTo(14.874f, 13f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Controller!!
    }

@Suppress("ObjectPropertyName")
private var _Controller: ImageVector? = null
