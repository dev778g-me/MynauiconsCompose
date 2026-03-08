package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Outline.Hospital",
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
                moveTo(10f, 20.5f)
                lineTo(10f, 5.094f)
                curveToRelative(0f, -0.88f, 0.672f, -1.594f, 1.5f, -1.594f)
                horizontalLineToRelative(8f)
                curveToRelative(0.828f, 0f, 1.5f, 0.714f, 1.5f, 1.594f)
                verticalLineToRelative(13.812f)
                curveToRelative(0f, 0.88f, -0.672f, 1.594f, -1.5f, 1.594f)
                close()
                moveTo(10f, 20.5f)
                lineTo(4.5f, 20.5f)
                curveToRelative(-0.828f, 0f, -1.5f, -0.714f, -1.5f, -1.594f)
                verticalLineToRelative(-5.312f)
                curveTo(3f, 12.714f, 3.672f, 12f, 4.5f, 12f)
                horizontalLineToRelative(4f)
                curveToRelative(0.828f, 0f, 1.5f, 0.713f, 1.5f, 1.594f)
                close()
                moveTo(13.5f, 20.5f)
                verticalLineToRelative(-4.781f)
                curveToRelative(0f, -0.88f, 0.672f, -1.594f, 1.5f, -1.594f)
                horizontalLineToRelative(1f)
                curveToRelative(0.828f, 0f, 1.5f, 0.713f, 1.5f, 1.594f)
                lineTo(17.5f, 20.5f)
                moveToRelative(-0.1f, -11.333f)
                horizontalLineToRelative(-3.6f)
                moveToRelative(-6.3f, 5.666f)
                lineTo(5.7f, 14.833f)
                moveToRelative(1.8f, 2.834f)
                lineTo(5.7f, 17.667f)
                moveToRelative(9.9f, -10.39f)
                verticalLineToRelative(3.779f)
            }
        }.build()

        return _Hospital!!
    }

@Suppress("ObjectPropertyName")
private var _Hospital: ImageVector? = null
