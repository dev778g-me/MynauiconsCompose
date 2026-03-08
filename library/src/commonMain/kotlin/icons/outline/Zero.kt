package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Zero: ImageVector
    get() {
        if (_Zero != null) {
            return _Zero!!
        }
        _Zero = ImageVector.Builder(
            name = "Outline.Zero",
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
                moveTo(8.75f, 13.875f)
                verticalLineToRelative(-3.75f)
                arcToRelative(3.125f, 3.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.25f, 0f)
                verticalLineToRelative(3.75f)
                arcToRelative(3.125f, 3.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.25f, 0f)
            }
        }.build()

        return _Zero!!
    }

@Suppress("ObjectPropertyName")
private var _Zero: ImageVector? = null
