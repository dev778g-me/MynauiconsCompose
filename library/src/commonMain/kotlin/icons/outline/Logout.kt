package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Outline.Logout",
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
                moveTo(13.496f, 21f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.105f, 0f, -2f, -1.151f, -2f, -2.571f)
                verticalLineTo(5.57f)
                curveToRelative(0f, -1.419f, 0.895f, -2.57f, 2f, -2.57f)
                horizontalLineToRelative(7f)
                moveTo(16f, 15.5f)
                lineToRelative(3.5f, -3.5f)
                lineTo(16f, 8.5f)
                moveToRelative(-6.5f, 3.496f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _Logout!!
    }

@Suppress("ObjectPropertyName")
private var _Logout: ImageVector? = null
