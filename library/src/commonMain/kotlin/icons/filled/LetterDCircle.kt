package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterDCircle: ImageVector
    get() {
        if (_LetterDCircle != null) {
            return _LetterDCircle!!
        }
        _LetterDCircle = ImageVector.Builder(
            name = "Filled.LetterDCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(12f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 2.75f)
                verticalLineToRelative(1f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.25f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveTo(10f, 7.25f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(2f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.25f, -4.25f)
                verticalLineToRelative(-1f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.25f)
                close()
            }
        }.build()

        return _LetterDCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterDCircle: ImageVector? = null
