package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Servers: ImageVector
    get() {
        if (_Servers != null) {
            return _Servers!!
        }
        _Servers = ImageVector.Builder(
            name = "Outline.Servers",
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
                moveTo(3f, 5.7f)
                curveToRelative(0f, -0.663f, 0.448f, -1.2f, 1f, -1.2f)
                horizontalLineToRelative(16f)
                curveToRelative(0.552f, 0f, 1f, 0.537f, 1f, 1.2f)
                verticalLineToRelative(3.6f)
                curveToRelative(0f, 0.663f, -0.448f, 1.2f, -1f, 1.2f)
                lineTo(4f, 10.5f)
                curveToRelative(-0.552f, 0f, -1f, -0.537f, -1f, -1.2f)
                close()
                moveTo(6f, 7.5f)
                horizontalLineToRelative(2f)
                moveToRelative(-2f, 9f)
                horizontalLineToRelative(2f)
                moveToRelative(-5f, -1.8f)
                curveToRelative(0f, -0.663f, 0.448f, -1.2f, 1f, -1.2f)
                horizontalLineToRelative(16f)
                curveToRelative(0.552f, 0f, 1f, 0.537f, 1f, 1.2f)
                verticalLineToRelative(3.6f)
                curveToRelative(0f, 0.663f, -0.448f, 1.2f, -1f, 1.2f)
                lineTo(4f, 19.5f)
                curveToRelative(-0.552f, 0f, -1f, -0.537f, -1f, -1.2f)
                close()
            }
        }.build()

        return _Servers!!
    }

@Suppress("ObjectPropertyName")
private var _Servers: ImageVector? = null
