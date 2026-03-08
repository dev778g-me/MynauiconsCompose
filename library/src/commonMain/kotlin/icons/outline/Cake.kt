package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cake: ImageVector
    get() {
        if (_Cake != null) {
            return _Cake!!
        }
        _Cake = ImageVector.Builder(
            name = "Outline.Cake",
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
                moveTo(9f, 11f)
                curveToRelative(1.162f, 3.722f, 4.667f, 4.269f, 6f, 0f)
                moveToRelative(-6f, 0f)
                curveToRelative(-1.053f, 3.373f, -3.462f, 3.74f, -5f, 1.91f)
                moveTo(15f, 11f)
                curveToRelative(0.934f, 2.992f, 3.383f, 3.933f, 5f, 1.967f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 21f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.09f, -0.91f, -2f, -2f, -2f)
                horizontalLineTo(6f)
                curveToRelative(-1.09f, 0f, -2f, 0.91f, -2f, 2f)
                verticalLineToRelative(8f)
                moveToRelative(-2f, 0f)
                horizontalLineToRelative(20f)
                moveTo(7f, 7f)
                verticalLineToRelative(4f)
                moveToRelative(5f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(5f, -4f)
                verticalLineToRelative(4f)
                moveTo(7f, 4f)
                verticalLineToRelative(0.5f)
                moveToRelative(5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveToRelative(5f, -0.5f)
                verticalLineToRelative(0.5f)
            }
        }.build()

        return _Cake!!
    }

@Suppress("ObjectPropertyName")
private var _Cake: ImageVector? = null
