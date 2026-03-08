package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CircleDashed: ImageVector
    get() {
        if (_CircleDashed != null) {
            return _CircleDashed!!
        }
        _CircleDashed = ImageVector.Builder(
            name = "Filled.CircleDashed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.792f, 0.765f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.584f, 1.382f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveToRelative(-2.06f, 0.414f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.398f, 0.983f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.626f, 1.77f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.061f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.102f, -2.091f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.983f, 0.399f)
                moveToRelative(8.644f, 1.692f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.091f, 3.102f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.382f, 0.584f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.77f, -2.626f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                moveTo(3.998f, 7.809f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.399f, 0.983f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.765f, -3.792f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.983f, -0.399f)
                moveTo(21f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.765f, 3.792f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.382f, -0.584f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveTo(3.414f, 14.81f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.983f, 0.398f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 2.626f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.061f, 1.06f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.091f, -3.102f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.399f, -0.983f)
                moveToRelative(15.48f, 3.024f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.102f, 2.091f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.584f, -1.382f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.626f, -1.77f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                moveTo(7.81f, 20.002f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.983f, -0.399f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.792f, -0.765f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.399f, -0.983f)
            }
        }.build()

        return _CircleDashed!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDashed: ImageVector? = null
