package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SearchMinus: ImageVector
    get() {
        if (_SearchMinus != null) {
            return _SearchMinus!!
        }
        _SearchMinus = ImageVector.Builder(
            name = "Outline.SearchMinus",
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
                moveTo(9.5f, 11.5f)
                horizontalLineToRelative(4f)
                moveToRelative(5.5f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
                moveToRelative(-2.107f, 5.42f)
                lineToRelative(3.08f, 3.08f)
            }
        }.build()

        return _SearchMinus!!
    }

@Suppress("ObjectPropertyName")
private var _SearchMinus: ImageVector? = null
