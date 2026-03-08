package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterBOctagon: ImageVector
    get() {
        if (_LetterBOctagon != null) {
            return _LetterBOctagon!!
        }
        _LetterBOctagon = ImageVector.Builder(
            name = "Filled.LetterBOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.241f, 9.8f)
                curveToRelative(0.064f, 0.602f, -0.204f, 1.191f, -0.761f, 1.45f)
                horizontalLineToRelative(-3.23f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.921f)
                curveToRelative(0.62f, 0f, 1.005f, 0.425f, 1.07f, 1.05f)
                moveToRelative(-3.991f, 5.45f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.557f, 0.259f, 0.825f, 0.848f, 0.761f, 1.45f)
                curveToRelative(-0.065f, 0.625f, -0.45f, 1.05f, -1.07f, 1.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.037f, 2.408f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.158f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, 0.036f, 0.9f, 0.158f)
                reflectiveCurveToRelative(0.54f, 0.31f, 0.762f, 0.53f)
                lineToRelative(4.337f, 4.337f)
                curveToRelative(0.22f, 0.221f, 0.408f, 0.463f, 0.53f, 0.762f)
                curveToRelative(0.123f, 0.298f, 0.158f, 0.598f, 0.158f, 0.9f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.313f, -0.039f, 0.616f, -0.163f, 0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.525f, 0.748f)
                lineToRelative(-4.337f, 4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.762f, 0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.158f)
                horizontalLineTo(8.937f)
                curveToRelative(-0.313f, 0f, -0.616f, -0.039f, -0.914f, -0.163f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.748f, -0.525f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.762f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.158f, -0.9f)
                verticalLineTo(8.937f)
                curveToRelative(0f, -0.313f, 0.039f, -0.616f, 0.163f, -0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.525f, -0.748f)
                lineToRelative(4.337f, -4.337f)
                curveToRelative(0.221f, -0.22f, 0.463f, -0.408f, 0.762f, -0.53f)
                moveTo(9.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.671f)
                curveToRelative(1.572f, 0f, 2.437f, -1.204f, 2.562f, -2.393f)
                curveToRelative(0.085f, -0.806f, -0.153f, -1.706f, -0.767f, -2.357f)
                curveToRelative(0.614f, -0.651f, 0.852f, -1.551f, 0.767f, -2.357f)
                curveToRelative(-0.125f, -1.19f, -0.99f, -2.393f, -2.562f, -2.393f)
                close()
            }
        }.build()

        return _LetterBOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _LetterBOctagon: ImageVector? = null
