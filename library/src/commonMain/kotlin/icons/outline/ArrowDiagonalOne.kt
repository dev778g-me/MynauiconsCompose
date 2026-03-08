package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowDiagonalOne: ImageVector
    get() {
        if (_ArrowDiagonalOne != null) {
            return _ArrowDiagonalOne!!
        }
        _ArrowDiagonalOne = ImageVector.Builder(
            name = "Outline.ArrowDiagonalOne",
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
                moveToRelative(4.929f, 12.707f)
                lineToRelative(7.778f, -7.778f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4.95f)
                moveToRelative(0f, -4.95f)
                horizontalLineToRelative(-4.95f)
                moveToRelative(11.314f, 6.364f)
                lineToRelative(-7.778f, 7.778f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4.95f)
                moveToRelative(-4.95f, 0f)
                verticalLineToRelative(-4.95f)
            }
        }.build()

        return _ArrowDiagonalOne!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonalOne: ImageVector? = null
