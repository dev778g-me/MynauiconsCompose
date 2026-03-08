package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Spinner: ImageVector
    get() {
        if (_Spinner != null) {
            return _Spinner!!
        }
        _Spinner = ImageVector.Builder(
            name = "Outline.Spinner",
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
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
                moveToRelative(6.366f, -0.366f)
                lineToRelative(-2.12f, 2.12f)
                moveTo(21f, 12f)
                horizontalLineToRelative(-3f)
                moveToRelative(0.366f, 6.366f)
                lineToRelative(-2.12f, -2.12f)
                moveTo(12f, 21f)
                verticalLineToRelative(-3f)
                moveToRelative(-6.366f, 0.366f)
                lineToRelative(2.12f, -2.12f)
                moveTo(3f, 12f)
                horizontalLineToRelative(3f)
                moveToRelative(-0.366f, -6.366f)
                lineToRelative(2.12f, 2.12f)
            }
        }.build()

        return _Spinner!!
    }

@Suppress("ObjectPropertyName")
private var _Spinner: ImageVector? = null
