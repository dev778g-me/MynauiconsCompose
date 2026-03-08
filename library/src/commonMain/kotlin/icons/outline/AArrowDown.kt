package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AArrowDown: ImageVector
    get() {
        if (_AArrowDown != null) {
            return _AArrowDown!!
        }
        _AArrowDown = ImageVector.Builder(
            name = "Outline.AArrowDown",
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
                moveTo(9.5f, 13.667f)
                lineTo(7f, 7f)
                lineToRelative(-2.5f, 6.667f)
                moveToRelative(5f, 0f)
                lineTo(10.75f, 17f)
                moveTo(9.5f, 13.667f)
                horizontalLineToRelative(-5f)
                moveTo(3.25f, 17f)
                lineToRelative(1.25f, -3.333f)
                moveTo(17.25f, 7.5f)
                verticalLineToRelative(9f)
                moveToRelative(3.5f, -3.5f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-3.5f, -3.5f)
            }
        }.build()

        return _AArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _AArrowDown: ImageVector? = null
